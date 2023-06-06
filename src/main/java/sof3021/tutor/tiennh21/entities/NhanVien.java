package sof3021.tutor.tiennh21.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name="NhanVien")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NhanVien {
    @Id
    @Column(name="Id")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name="Ma")
    private String ma;

    @Column(name="Ten")
    private String ten;

    @Column(name="TenDem")
    private String tenDem;

    @Column(name="Ho")
    private String ho;

    @Column(name="GioiTinh")
    private String gioiTinh;

    @Column(name="NgaySinh")
    private Date ngaySinh;

    @Column(name="DiaChi")
    private String diaChi;

    @Column(name="Sdt")
    private String sdt;

    @Column(name="MatKhau")
    private String matKhau;

    @Column(name="IdCH")
    private UUID idCH;

    @Column(name="IdCV")
    private UUID idCV;

    @Column(name="TrangThai")
    private int trangThai;

    @Column(name="IdGuiBC")
    private UUID idGuiBC;
}
