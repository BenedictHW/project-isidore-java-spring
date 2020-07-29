package com.hanshenwang.projectisidore;

import org.springframework.stereotype.Controller;
import com.hanshenwang.projectisidore.EmailService;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ContactController {

    @Autowired
    private EmailService emailService;

    @GetMapping("/contactme")
    public String getContactForm(Model model) {
        model.addAttribute("contactme", new ContactForm());
        return "contactme";
    }

    @PostMapping("/contactme")
    public String submitContactForm(@ModelAttribute ContactForm contactme) {
        emailService.sendMail("contact.hanshen.wang@gmail.com", contactme.getId(), contactme.getContent(), contactme.getName());
        return "contactsubmitted";
    }

}
