// package com.chillyfacts.com;
// import java.io.File;
// import java.sql.Connection;
// import java.sql.ResultSet;
// import java.sql.Statement;
// import java.util.HashMap;
// import java.util.Map;
// import com.google.zxing.BarcodeFormat;
// import com.google.zxing.EncodeHintType;
// import com.google.zxing.MultiFormatWriter;
// import com.google.zxing.client.j2se.MatrixToImageWriter;
// import com.google.zxing.common.BitMatrix;
// import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
// public class Dyanamic_QR {
// 	public static void main(String[] args) {
// 		try {
// 			DBConnection obj_DBConnection = new DBConnection();
//             Connection connection = obj_DBConnection.getConnection();
//             String query = "select * from links";
//             Statement stmt = null;
//             stmt = connection.createStatement();
//             ResultSet rs = stmt.executeQuery(query);
//             while (rs.next()) {
//             	Dyanamic_QR.generate_qr(rs.getString("sl_no"),rs.getString("links"));
//             }
// 		} catch (Exception e) {
// 			// TODO: handle exception
// 		}
// 	}
// 	public static void generate_qr(String image_name,String qrCodeData) {
//         try {
//             String filePath = "D:\\QRCODE\\"+image_name+".png";
//             String charset = "UTF-8"; // or "ISO-8859-1"
//             Map < EncodeHintType, ErrorCorrectionLevel > hintMap = new HashMap < EncodeHintType, ErrorCorrectionLevel > ();
//             hintMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L);
//             BitMatrix matrix = new MultiFormatWriter().encode(
//                 new String(qrCodeData.getBytes(charset), charset),
//                 BarcodeFormat.QR_CODE, 200, 200, hintMap);
//             MatrixToImageWriter.writeToFile(matrix, filePath.substring(filePath
//                 .lastIndexOf('.') + 1), new File(filePath));
//             System.out.println("QR Code image created successfully!");
//         } catch (Exception e) {
//             System.err.println(e);
//         }
//     }
// }