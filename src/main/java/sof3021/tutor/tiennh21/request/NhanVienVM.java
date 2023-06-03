package sof3021.tutor.tiennh21.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class NhanVienVM {
    private String ma;
    private String ho;
    private String tenDem;
    private String ten;
    private String gioiTinh;
    private String sdt;
    private Date ngaySinh;
    private String matKhau;
    private String TrangThai;
    private String diaChi;
}
