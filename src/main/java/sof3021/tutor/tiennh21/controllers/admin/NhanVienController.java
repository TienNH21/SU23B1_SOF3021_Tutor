package sof3021.tutor.tiennh21.controllers.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import sof3021.tutor.tiennh21.request.NhanVienVM;

import java.util.ArrayList;

@Controller
public class NhanVienController {
    private ArrayList<NhanVienVM> listNV;

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
        System.out.println(vm.getNgaySinh().toString());
        this.listNV.add(vm);
        return "admin/nhan_vien/create";
    }

    @GetMapping("nhan-vien/index")
    public String index(Model model)
    {
        model.addAttribute("listNV", listNV);
        return "admin/nhan_vien/index";
    }

    @GetMapping("nhan-vien/delete/{ma}")
    public String delete(@PathVariable("ma") String ma)
    {
        for (int i = 0; i < listNV.size(); i++) {
            if (listNV.get(i).getMa().equals(ma)) {
                this.listNV.remove(i);
                break;
            }
        }

        return "redirect:/nhan-vien/index";
    }
}
