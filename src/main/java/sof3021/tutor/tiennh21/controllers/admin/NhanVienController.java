package sof3021.tutor.tiennh21.controllers.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import sof3021.tutor.tiennh21.entities.NhanVien;
import sof3021.tutor.tiennh21.repositories.NhanVienRepository;
import sof3021.tutor.tiennh21.request.NhanVienVM;

import java.util.ArrayList;
import java.util.UUID;

@Controller
public class NhanVienController {
    private ArrayList<NhanVienVM> listNV;

    @Autowired
    private NhanVienRepository nvRepo;

    public NhanVienController()
    {
        this.listNV = new ArrayList<>();
    }

    @GetMapping("nhan-vien/create")
    public String create(Model model, @ModelAttribute("data") NhanVienVM vm)
    {
//        NhanVienVM vm1 = new NhanVienVM(); // khởi tạo view-model
//        model.addAttribute("data", vm1); // Thêm vm1 vào Model với tên data

        model.addAttribute("action", "/nhan-vien/store");
        return "admin/nhan_vien/create";
    }

    @PostMapping("nhan-vien/store")
    public String store(NhanVienVM vm)
    {
        NhanVien nv = new NhanVien();
        nv.setMa( vm.getMa() );
        nv.setHo( vm.getHo() );
        nv.setTenDem( vm.getTenDem() );
        nv.setTen( vm.getTen() );
        nv.setGioiTinh( vm.getGioiTinh() );
        nv.setNgaySinh( vm.getNgaySinh() );
        nv.setDiaChi( vm.getDiaChi() );
        nv.setSdt( vm.getSdt() );
        nv.setMatKhau( vm.getMatKhau() );
        nv.setTrangThai( vm.getTrangThai() );
        this.nvRepo.save(nv);
        return "admin/nhan_vien/create";
    }

    @GetMapping("nhan-vien/index")
    public String index(Model model)
    {
        model.addAttribute("listNV", this.nvRepo.findAll());
        return "admin/nhan_vien/index";
    }

    @GetMapping("nhan-vien/delete/{id}")
    public String delete(@PathVariable("id") NhanVien nv)
    {
//        NhanVien nv = this.nvRepo.findById(id).get();
        this.nvRepo.delete(nv);
        return "redirect:/nhan-vien/index";
    }
}
