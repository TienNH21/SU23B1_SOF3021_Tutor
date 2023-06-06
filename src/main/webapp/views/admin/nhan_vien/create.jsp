<%@ page language="java" pageEncoding="UTF-8" %>
<html>
<head></head>
<body>
<form action="${ action }" method="POST">
    <div>
        <label>Mã</label>
        <input type="text" name="ma" value="${ data.ma }" />
    </div>
    <div>
        <label>Họ</label>
        <input type="text" name="ho" value="${ data.ho }" />
    </div>
    <div>
        <label>Tên Đệm</label>
        <input type="text" name="tenDem" value="${ data.tenDem }" />
    </div>
    <div>
        <label>Tên</label>
        <input type="text" name="ten" value="${ data.ten }" />
    </div>
    <div>
        <label>Địa Chỉ</label>
        <input type="text" name="diaChi" value="${ data.diaChi }" />
    </div>
    <div>
        <label>Số điện thoại</label>
        <input type="text" name="sdt" value="${ data.sdt }" />
    </div>
    <div>
        <label>Mật Khẩu</label>
        <input type="password" name="matKhau" />
    </div>
    <div>
        <label>Ngày sinh</label>
        <input type="text" name="ngaySinh" value="${ data.ngaySinh }" />
    </div>
    <div>
        <label>Giới tính</label>
        <input type="radio" name="gioiTinh" value="nam"
            ${ data.gioiTinh.equals("nam") ? "selected" : "" } />
        <label>Nam</label>
        <input type="radio" name="gioiTinh" value="nu"
            ${ data.gioiTinh.equals("nu") ? "selected" : "" } />
        <label>Nữ</label>
    </div>
    <div>
        <label>Trạng thái</label>
        <input type="radio" name="trangThai" value="1"
            ${ data.trangThai == 1 ? "selected" : "" } />
        <label>Đang hoạt động</label>
        <input type="radio" name="trangThai" value="0"
            ${ data.trangThai == 0 ? "selected" : "" } />
        <label>Không hoạt động</label>
    </div>
    <div>
        <button>Submit</button>
    </div>
</form>
</body>
</html>