package IO;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExcelDemoTest {
    @Test

    //创建并写入Excel
    public void excelWrite(){
        //1 创建一个工作薄，就是一个Excel文件
        HSSFWorkbook wb = new HSSFWorkbook();

        //2 创建一个sheet页
        HSSFSheet firstsheet = wb.createSheet("firstsheet");

        //3 创建行
        HSSFRow row = firstsheet.createRow(0);

        //4 写入数据
        row.createCell(0).setCellValue("name");
        row.createCell(1).setCellValue(20);
        row.createCell(2).setCellValue(true);

        //读小数
        HSSFCell cell = row.createCell(3);
        cell.setCellValue(6000);
        HSSFCellStyle cellStyle = wb.createCellStyle();
        cellStyle.setDataFormat(HSSFDataFormat.getBuiltinFormat("0.00"));
        cell.setCellStyle(cellStyle);

        //写入日期
        HSSFCreationHelper creationHelper = wb.getCreationHelper();
        HSSFCellStyle dateCellStyle = wb.createCellStyle();
        dateCellStyle.setDataFormat(creationHelper.createDataFormat().getFormat("yyyy-MM-dd"));
        HSSFCell cell1 = row.createCell(4);
        cell1.setCellValue(new Date());
        cell1.setCellStyle(dateCellStyle);

        FileOutputStream out = null;
        try{
            out = new FileOutputStream("/Users/lixiangyu/IdeaProjects/java_QuickStart/src/test/java/IO/a.xls");
            wb.write(out);
            out.close();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("write end");
    }

    //读Excel
    @Test
    public void readExcel() throws Exception{
        InputStream is = new FileInputStream("/Users/lixiangyu/IdeaProjects/java_QuickStart/src/test/java/IO/a.xls");
        POIFSFileSystem fs = new POIFSFileSystem(is);

        //创建工作薄
        HSSFWorkbook wb = new HSSFWorkbook(fs);
        HSSFSheet sheet = wb.getSheetAt(0);

        if(sheet==null){
            return;
        }
        else{
            for(int i=0;i<=sheet.getLastRowNum();i++){
                HSSFRow row = sheet.getRow(i);
                if(row==null){
                    continue;
                }
                else{
                    for(int j=0;j<=row.getLastCellNum();j++){
                        HSSFCell cell = row.getCell(j);
                        if(cell==null){
                            continue;
                        }
                        else{
                            String str="";
                            if(cell.getCellType()==HSSFCell.CELL_TYPE_NUMERIC) {
                                if (HSSFDateUtil.isCellDateFormatted(cell)) {
                                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                                    str = sdf.format(HSSFDateUtil.getJavaDate(cell.getNumericCellValue())).toString();
                                    //System.out.println(str);
                                } else {
                                    str = String.valueOf(cell.getNumericCellValue());
                                    //System.out.println(str);
                                }
                            }
                            else if(cell.getCellType()==HSSFCell.CELL_TYPE_BOOLEAN){
                                str = String.valueOf(cell.getBooleanCellValue());
                                //System.out.println(str);
                            }
                            else{
                                str = cell.getStringCellValue();
                                //System.out.println(str);
                            }
                            if(j==2){
                                str = str.toUpperCase();
                            }
                            if(j==1){
                                str.substring(0,str.indexOf("."));
                            }
                            System.out.println(str);
                        }
                    }
                }
            }
        }
    }
}
