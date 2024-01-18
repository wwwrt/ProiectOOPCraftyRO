package ro.emanuel.crafty.controller;

import java.io.IOException;
import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import ro.emanuel.crafty.dao.CraftDao;
import ro.emanuel.crafty.pojo.*;

@Controller
public class CraftController {
	
	//get by id Buyers
	
	@GetMapping("buyers/{id}")
	public ModelAndView getSingleBuyer(@PathVariable int id) throws SQLException {
		ModelAndView mav = new ModelAndView("singleBuyer");
		mav.addObject("buyer", CraftDao.getBuyerById(id));
		return mav;
	}
	
	//get by id Sellers
	
	@GetMapping("sellers/{id}")
	public ModelAndView getSingleSeller(@PathVariable int id) throws SQLException {
		ModelAndView mav = new ModelAndView("singleSeller");
		mav.addObject("seller", CraftDao.getSellerById(id));
		return mav;
	}
	
	//get by id Crafts
	
	@GetMapping("crafts/{id}")
	public ModelAndView getSingleCraft(@PathVariable int id) throws SQLException {
		ModelAndView mav = new ModelAndView("singleCraft");
		mav.addObject("craft", CraftDao.getCraftById(id));
		return mav;
	}
	
	//--------------------------------------------------
	
	//get all Buyers
	
	@GetMapping("buyers/all")
	public ModelAndView allB() throws SQLException {
		ModelAndView mav = new ModelAndView("allBuyers");
		mav.addObject("buyers", CraftDao.allBuyers());
		return mav;
	}
	
	//get all Sellers
	
	@GetMapping("sellers/all")
	public ModelAndView allS() throws SQLException {
		ModelAndView mav = new ModelAndView("allSellers");
		mav.addObject("sellers", CraftDao.allSellers());
		return mav;
	}
	
	//get all Crafts
	
	@GetMapping("crafts/all")
	public ModelAndView allC() throws SQLException {
		ModelAndView mav = new ModelAndView("allCrafts");
		mav.addObject("crafts", CraftDao.allCrafts());
		return mav;
	}
	
	//--------------------------------------------------
	
	//delete Buyers
	
	@GetMapping("buyers/delete/{id}")
	public ModelAndView deleteBById(@PathVariable int id) throws SQLException {
		CraftDao.deleteBuyerById(id);
		return new ModelAndView("redirect:/buyers/all");
	}
	
	//delete Sellers
	
	@GetMapping("sellers/delete/{id}")
	public ModelAndView deleteSById(@PathVariable int id) throws SQLException {
		CraftDao.deleteSellerById(id);
		return new ModelAndView("redirect:/sellers/all");
	}
	
	//delete Crafts
	
	@GetMapping("crafts/delete/{id}")
	public ModelAndView deleteCById(@PathVariable int id) throws SQLException {
		CraftDao.deleteCraftById(id);
		return new ModelAndView("redirect:/crafts/all");
	}
	
	//--------------------------------------------------
	
	//create Buyers
	
	@GetMapping("/buyers/create")
	public ModelAndView addBuyer(Model model) throws SQLException {
		model.addAttribute("buyers", new Buyers());
		return new ModelAndView("createBuyer", "model", model);
	
	}
	
	@PostMapping("/buyers/create")
	public ModelAndView createbuyer(@ModelAttribute Buyers buyer, ModelMap m, BindingResult bs) throws SQLException {
	CraftDao.createBuyer(buyer);
	return new ModelAndView("redirect:/buyers/all");}
	
	//create Sellers
	
	@GetMapping("/sellers/create")
	public ModelAndView addSeller(Model model) throws SQLException {
		model.addAttribute("sellers", new Sellers());
		return new ModelAndView("createSeller", "model", model);
	
	}
	
	@PostMapping("/sellers/create")
	public ModelAndView createseller(@ModelAttribute Sellers seller, ModelMap m, BindingResult bs) throws SQLException {
	CraftDao.createSeller(seller);
	return new ModelAndView("redirect:/sellers/all");}
	
	//create Crafts
	
	@GetMapping("/crafts/create")
	public ModelAndView addCraft(Model model) throws SQLException {
		model.addAttribute("crafts", new Crafts());
		return new ModelAndView("createCraft", "model", model);
	
	}
	
	@PostMapping("/crafts/create")
	public ModelAndView createCraft(@ModelAttribute Crafts craft, ModelMap m, BindingResult bs) throws SQLException {
	CraftDao.createCraft(craft);
	return new ModelAndView("redirect:/crafts/all");}
	
	//--------------------------------------------------
	
	//edit Buyers
	
	@GetMapping("/buyers/edit/{id}")
	public ModelAndView buyerEditGet(Model model, @PathVariable int id) throws SQLException, IOException, ClassNotFoundException {
		
		Buyers buyer = CraftDao.getBuyerById(id);
		model.addAttribute("buyers", buyer);
	
		return new ModelAndView("editBuyer", "model", model);
		
	}
	
	@PostMapping("/buyers/edit/{id}")
	public ModelAndView buyerEditSave(@ModelAttribute("buyers") Buyers b, @PathVariable int id, ModelMap model, BindingResult result) {
	    try {
	         CraftDao.editBuyer(b);
	    } catch(Exception e) {
	        e.printStackTrace();
	    }
	    return new ModelAndView("redirect:/buyers/all");
	}
	
	//edit Sellers
	
	@GetMapping("/sellers/edit/{id}")
	public ModelAndView sellerEditGet(Model model, @PathVariable int id) throws SQLException, IOException, ClassNotFoundException {
		
		Sellers seller = CraftDao.getSellerById(id);
		model.addAttribute("sellers", seller);
	
		return new ModelAndView("editSeller", "model", model);
		
	}
	
	@PostMapping("/sellers/edit/{id}")
	public ModelAndView sellerEditSave(@ModelAttribute("sellers") Sellers s, @PathVariable int id, ModelMap model, BindingResult result) {
	    try {
	         CraftDao.editSeller(s);
	    } catch(Exception e) {
	        e.printStackTrace();
	    }
	    return new ModelAndView("redirect:/sellers/all");
	}
	
	//edit Crafts
	
	@GetMapping("/crafts/edit/{id}")
	public ModelAndView craftEditGet(Model model, @PathVariable int id) throws SQLException, IOException, ClassNotFoundException {
		
		Crafts craft = CraftDao.getCraftById(id);
		model.addAttribute("crafts", craft);
	
		return new ModelAndView("editCraft", "model", model);
		
	}
	
	@PostMapping("/crafts/edit/{id}")
	public ModelAndView craftEditSave(@ModelAttribute("crafts") Crafts c, @PathVariable int id, ModelMap model, BindingResult result) {
	    try {
	         CraftDao.editCraft(c);
	    } catch(Exception e) {
	        e.printStackTrace();
	    }
	    return new ModelAndView("redirect:/crafts/all");
	}

}
