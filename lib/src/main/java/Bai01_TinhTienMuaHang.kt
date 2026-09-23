fun main()
{
    val slSanPham: Int = 5
    val donGia: Double = 21_500.0
    val thue: Double = 0.08
    val tienHang: Double = slSanPham.toDouble() * donGia
    val tienThue: Double = tienHang * thue
    val tongTien: Double = tienHang + tienThue

    println("So luong: $slSanPham")
    println("Don Gia: $donGia")
    println("Tien Hang: $tienHang VND")
    println("Thue 8%: $tienThue VND")
    println("Tong tien thanh toan: $tongTien VND")

}