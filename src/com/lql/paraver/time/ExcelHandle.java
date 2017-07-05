//package com.lql.paraver.time;
//
//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileReader;
//import java.io.IOException;
//import java.math.BigDecimal;
//import java.util.HashMap;
//import java.util.Hashtable;
//import java.util.Map;
//import java.util.regex.Matcher;
//
//import jxl.Cell;
//import jxl.Sheet;
//import jxl.Workbook;
//import jxl.read.biff.BiffException;
//import jxl.write.Label;
//import jxl.write.WritableSheet;
//import jxl.write.WritableWorkbook;
//import jxl.write.WriteException;
//import jxl.write.biff.RowsExceededException;
//import org.omg.CORBA.DoubleHolder;
//import org.omg.CORBA.MARSHAL;
//
//public class ExcelHandle {
//
//	public static void handleExcel() {
//
//		String path = "E:\\data-1.xls";
//		File file = new File(path);
//		try {
//			Workbook workbook = Workbook.getWorkbook(file);
//			Sheet sheet = workbook.getSheet(0);
//			System.out.println("sheet.getRows() : " + sheet.getRows());
//			System.out.println("sheet.getClomns() : " + sheet.getColumns());
////			double[] zanDegrees = new double[24];
////			double[] commentDegrees = new double[24];
////
//			Map<String,Integer> map = new HashMap<String,Integer>();
//			for (int i = 1; i < sheet.getRows(); i++) {
//				 for(int j = 0 ; j < 1; j++){
//				 Cell cell = sheet.getCell(j , i);
//				 String content = cell.getContents();
//				 int index = content.lastIndexOf(".");
//				 content = content.substring(0, index);
//				 System.out.println(content);
////				 if(map.get(cell.getContents()) == null)
////					 map.put(cell.getContents(), 1);
////				 else{
////					 map.put(cell.getContents(), map.get(cell.getContents()) + 1);
////				 }
////				 System.out.println(cell.getContents());
//				 }
//			}
////
////				Cell zanCell = sheet.getCell(3, i);
////				Cell stateCell = sheet.getCell(2, i);
////				Cell commentCell = sheet.getCell(4, i);
////				Cell friendCell = sheet.getCell(5, i);
////				int zanNum = Integer.parseInt(zanCell.getContents());
////				int stateNum = Integer.parseInt(stateCell.getContents());
////				int commentNum = Integer.parseInt(commentCell.getContents());
////				int friendsNum = Integer.parseInt(friendCell.getContents());
////				double zanDegree = getZanDegree(zanNum, stateNum, friendsNum);
////				double commentDegree = getZanDegree(commentNum, stateNum,
////						friendsNum);
////				zanDegrees[i - 1] = zanDegree;
////				commentDegrees[i - 1] = commentDegree;
////			}
//////			writeToExcel(zanDegrees);
////			writeToExcel(commentDegrees);
////			for (int i = 0; i < 24; i++) {
////				System.out.println(zanDegrees[i]);
////			}
////			for(Map.Entry<String,Integer> entry : map.entrySet()){
////				System.out.println(entry.getValue());
//////				System.out.println(entry.getKey());
////			}
//		} catch (BiffException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//	}
//
//
//	public static void handleExcel1() {
//
//		String path = "E:\\data-1.xls";
//		File file = new File(path);
//		try {
//			Workbook workbook = Workbook.getWorkbook(file);
//			Sheet sheet = workbook.getSheet(0);
//			System.out.println("sheet.getRows() : " + sheet.getRows());
//			System.out.println("sheet.getClomns() : " + sheet.getColumns());
////			double[] zanDegrees = new double[24];
////			double[] commentDegrees = new double[24];
////
//			Map<String,Integer> map = new HashMap<String,Integer>();
//			for (int i = 1; i < sheet.getRows(); i++) {
//				 for(int j = 5 ; j < 6; j++){
//				 Cell cell = sheet.getCell(j , i);
//				 if(map.get(cell.getContents()) == null)
//					 map.put(cell.getContents(), 1);
//				 else{
//					 map.put(cell.getContents(), map.get(cell.getContents()) + 1);
//				 }
////				 System.out.println(cell.getContents());
//				 }
//			}
////
////				Cell zanCell = sheet.getCell(3, i);
////				Cell stateCell = sheet.getCell(2, i);
////				Cell commentCell = sheet.getCell(4, i);
////				Cell friendCell = sheet.getCell(5, i);
////				int zanNum = Integer.parseInt(zanCell.getContents());
////				int stateNum = Integer.parseInt(stateCell.getContents());
////				int commentNum = Integer.parseInt(commentCell.getContents());
////				int friendsNum = Integer.parseInt(friendCell.getContents());
////				double zanDegree = getZanDegree(zanNum, stateNum, friendsNum);
////				double commentDegree = getZanDegree(commentNum, stateNum,
////						friendsNum);
////				zanDegrees[i - 1] = zanDegree;
////				commentDegrees[i - 1] = commentDegree;
////			}
//////			writeToExcel(zanDegrees);
////			writeToExcel(commentDegrees);
////			for (int i = 0; i < 24; i++) {
////				System.out.println(zanDegrees[i]);
////			}
//			for(Map.Entry<String,Integer> entry : map.entrySet()){
//				System.out.println(entry.getValue());
////				System.out.println(entry.getKey());
//			}
//		} catch (BiffException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//	}
//
//	public static void handleExcel2() {
//
//		String path = "E:\\data-1.xls";
//		File file = new File(path);
//		try {
//			Workbook workbook = Workbook.getWorkbook(file);
//			Sheet sheet = workbook.getSheet(0);
//			System.out.println("sheet.getRows() : " + sheet.getRows());
//			System.out.println("sheet.getClomns() : " + sheet.getColumns());
////			double[] zanDegrees = new double[24];
////			double[] commentDegrees = new double[24];
////
//			Map<String,Map<String,Integer>> map = new HashMap<String,Map<String,Integer>>();
//			for (int i = 1; i < sheet.getRows(); i++) {
//				 for(int j = 0 ; j < 1; j++){
//				 Cell cell = sheet.getCell(j , i);
//				 Cell typeCell = sheet.getCell(j + 5,i);
//				 String content = cell.getContents();
//				 String type = typeCell.getContents();
//				 if(map.get(content) == null){
//					 Map<String,Integer> c = new HashMap<String,Integer>();
//					 c.put(type,1);
//					 map.put(content,c);
//				 }
//				 else{
//					 Map<String,Integer> cur = map.get(content);
//					 if(cur.get(type) == null){
//						 cur.put(type,1);
//					 }else{
//						 cur.put(type, cur.get(type) + 1);
//					 }
////					 map.put(content, cur);
////					 map.put(cell.getContents(), map.get(cell.getContents()) + 1);
//				 }
////				 System.out.println(cell.getContents());
//				 }
//			}
////
////				Cell zanCell = sheet.getCell(3, i);
////				Cell stateCell = sheet.getCell(2, i);
////				Cell commentCell = sheet.getCell(4, i);
////				Cell friendCell = sheet.getCell(5, i);
////				int zanNum = Integer.parseInt(zanCell.getContents());
////				int stateNum = Integer.parseInt(stateCell.getContents());
////				int commentNum = Integer.parseInt(commentCell.getContents());
////				int friendsNum = Integer.parseInt(friendCell.getContents());
////				double zanDegree = getZanDegree(zanNum, stateNum, friendsNum);
////				double commentDegree = getZanDegree(commentNum, stateNum,
////						friendsNum);
////				zanDegrees[i - 1] = zanDegree;
////				commentDegrees[i - 1] = commentDegree;
////			}
//////			writeToExcel(zanDegrees);
////			writeToExcel(commentDegrees);
////			for (int i = 0; i < 24; i++) {
////				System.out.println(zanDegrees[i]);
////			}
//			for(Map.Entry<String,Map<String,Integer>> entry : map.entrySet()){
////				System.out.println(entry.getValue());
//				System.out.println(entry.getKey());
//
//				Map<String,Integer> cur = entry.getValue();
//				for(Map.Entry<String,Integer> tmp : cur.entrySet()){
//					System.out.println(tmp.getKey() + " " + tmp.getValue());
//				}
//			}
//
//			Map<String,Integer> m = map.get("2017.1");
//			for(Map.Entry<String, Integer> tm : m.entrySet()){
//				System.out.println(tm.getKey());
//			}
//		} catch (BiffException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//	}
//
//	public static void writeToExcel(double[] nums) {
//		String path = "E:\\friends.xls";
//		File file = new File(path);
//		Workbook workbook;
//		WritableWorkbook writableWorkbook = null;
//		try {
//
//			workbook = Workbook.getWorkbook(file);
//
//			writableWorkbook = Workbook.createWorkbook(file, workbook);
//			WritableSheet sheet = writableWorkbook.getSheet(0);
//			for(int i = 1 ; i < 25;i++){
//			sheet.addCell(new Label( 7, i, String.valueOf(nums[i - 1])));
//			}
//			writableWorkbook.write();
//		} catch (BiffException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (RowsExceededException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (WriteException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} finally {
//			try {
//				if (writableWorkbook != null) {
//					writableWorkbook.close();
//				}
//			} catch (WriteException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//
//	}
//
//
//	//读线下各表的统计个数
//	public static void wirteToExcel2(String path){
//
//		File file = new File(path);
//		Workbook workbook = null;
//		WritableWorkbook writableWorkbook = null;
//
//		try {
//			workbook = Workbook.getWorkbook(file);
//			writableWorkbook = Workbook.createWorkbook(file, workbook);
//			WritableSheet sheet = writableWorkbook.getSheet(0);
//			int []nums = new int[26];
//			for(int i = 1 ; i <=24; i++){
//				Cell cell = sheet.getCell(i,25);
//				System.out.println(cell.getContents());
//				nums[i] =Integer.parseInt(cell.getContents());
//
//			}
//			for(int i = 1 ; i <=24; i++){
//				sheet.addCell(new Label(25, i, String.valueOf(nums[i])));
//			}
//		} catch (BiffException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IndexOutOfBoundsException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (RowsExceededException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (WriteException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} finally{
//			try {
//				if (writableWorkbook != null) {
//					writableWorkbook.close();
//				}
//				if(workbook != null){
//					workbook.close();
//				}
//			} catch (WriteException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//
//	}
//
//	//将矩阵对称
//    public static void wirteToExcel3(String path,String writePath){
//
//		File file = new File(path);
//		File file2 = new File(writePath);
//		Workbook workbook = null;
//		WritableWorkbook writableWorkbook = null;
//
//		try {
//			workbook = Workbook.getWorkbook(file);
//			Sheet sheet = workbook.getSheet(0);
////			writableWorkbook = Workbook.createWorkbook(file, workbook);
////			WritableSheet sheet2 = writableWorkbook.getSheet(0);
////			writableWorkbook = Workbook.createWorkbook(file2);
////			WritableSheet sheet2 = writableWorkbook.getSheet(0);
//			int []nums = new int[26];
//			for(int j = 0 ; j <= 605 ; j++){
//			   for(int i = 4 ; i <=4; i++){
//				Cell cell = sheet.getCell(i,j);
//
//				int tmp = 6 - Integer.parseInt(cell.getContents());
//				System.out.print(tmp);
////				sheet2.addCell(new Label( i, j, String.valueOf(tmp)));
//
//			 }
//			   System.out.println();
//
////			 for(int n = j ; n <= 24 ;n++){
////				 System.out.print(nums[n]+" ");
////			 }
////			 System.out.println();
//
//			}
////			for(int i = 1 ; i <=24; i++){
////				sheet.addCell(new Label(25, i, String.valueOf(nums[i])));
////			}
//		} catch (BiffException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IndexOutOfBoundsException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}   finally{
//			try {
//				if (writableWorkbook != null) {
//					writableWorkbook.close();
//				}
//				if(workbook != null){
//					workbook.close();
//				}
//			} catch (WriteException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//
//	}
//
//	public static double getZanDegree(int zanNum, int stateNum, int friendsNum) {
//
//		if (zanNum == 0 || stateNum == 0 || friendsNum == 0) {
//			return 0;
//		}
//		double tmp = zanNum * 1.0 / (stateNum * friendsNum) * 100;
//		BigDecimal decimal = new BigDecimal(tmp);
//		return decimal.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
//	}
//
//
//	//读线下各表的统计个数
//	public static void readTraceExcel(String path){
//
//		File file = new File(path);
//		Workbook workbook = null;
//		WritableWorkbook writableWorkbook = null;
//
//		try {
//			workbook = Workbook.getWorkbook(file);
//			writableWorkbook = Workbook.createWorkbook(file, workbook);
//			WritableSheet sheet = writableWorkbook.getSheet(0);
//			int []nums = new int[1448];
//			for(int i = 1 ; i <=1448; i++){
//				Cell cell = sheet.getCell(i,1);
//				System.out.println(cell.getContents());
////				nums[i] =Integer.parseInt(cell.getContents());
//			}
////			for(int i = 1 ; i <=24; i++){
////				sheet.addCell(new Label(25, i, String.valueOf(nums[i])));
////			}
//		} catch (BiffException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IndexOutOfBoundsException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
////		catch (RowsExceededException e) {
////			// TODO Auto-generated catch block
////			e.printStackTrace();
////		}
////		catch (WriteException e) {
////			// TODO Auto-generated catch block
////			e.printStackTrace();
////		}
//		finally{
//			try {
//				if (writableWorkbook != null) {
//					writableWorkbook.close();
//				}
//				if(workbook != null){
//					workbook.close();
//				}
//			} catch (WriteException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//
//	}
//
//
//	public static void reader(String path){
//		try {
//			BufferedReader reader = new BufferedReader(new FileReader(path));//换成你的文件名
//			reader.readLine();//第一行信息，为标题信息，不用，如果需要，注释掉
//			String line = null;
//			Map<String,Map<String,Double>> map = new HashMap<>();
//			while((line=reader.readLine())!=null){
////				line = line.substring(1,line.length() - 1);
//				System.out.println(line);
//				String[] items = line.split("\t");
//				String key1 = items[0];
//				String key2 = items[items.length - 1];
//				double time = Double.parseDouble(items[2]);
//
//				Map<String,Double> map1 = map.get(key1);
//				if (map1 == null){
//					map1 = new HashMap<>();
//					map1.put(key2,time);
//				}else {
//					if (map1.get(key2) == null){
//						map1.put(key2,time);
//					}else {
//						double oldTime = map1.get(key2);
//						map1.put(key2,oldTime + time);
//					}
//				}
//				map.put(key1,map1);
//			}
//			double runningTime = map.get("1.1.1").get("1.00");
//			double communicateTime = map.get("1.1.1").get("13.00");
//			BigDecimal rTime = new BigDecimal(String.valueOf(runningTime));
//			BigDecimal cTime = new BigDecimal(String.valueOf(communicateTime));
//			System.out.println("running time : " + rTime.toPlainString());
//			System.out.println("communication time : " + cTime.toPlainString());
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//
//
//
//	public static void main(String[] args) {
////		 handleExcel();
////		 handleExcel1();
////		 handleExcel2();
////		 wirteToExcel3("E:/data-1.xls","E:/data-2.xls");
////       System.out.println(getZanDegree(21, 13, 18));
////		readTraceExcel("G:\\10M-25.xlsx");
//		reader("G:\\5M\\cpu无限制\\5M-100%.csv");
//	}
//}
