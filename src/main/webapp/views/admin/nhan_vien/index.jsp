<%@ page language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <%@ taglib prefix="c" uri="jakarta.tags.core" %>
    <%@ taglib prefix="fn" uri="jakarta.tags.functions" %>
</head>
<body>
    <table>
        <thead>
            <tr>
                <td>Mã</td>
                <td>Họ</td>
                <td>Tên Đệm</td>
                <td>Tên</td>
                <td>Địa Chỉ</td>
                <td>Ngày sinh</td>
                <td>Giới tính</td>
                <td>SDT</td>
                <td>Trạng Thái</td>
                <td colspan="2">Thao tác</td>
            </tr>
        </thead>
        <tbody>
        <c:forEach items="${ listNV }" var="nv">
            <tr>
                <td>${ nv.ma }</td>
                <td>${ nv.ho }</td>
                <td>${ nv.tenDem }</td>
                <td>${ nv.ten }</td>
                <td>${ nv.diaChi }</td>
                <td>${ nv.ngaySinh }</td>
                <td>${ nv.gioiTinh }</td>
                <td>${ nv.sdt }</td>
                <td>${ nv.trangThai }</td>
                <td>
                    <a href="#">Cập nhật</a>
                </td>
                <td>
                    <a href="/nhan-vien/delete/${ nv.id }">Xóa</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</body>
</html>