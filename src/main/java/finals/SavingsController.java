package finals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SavingsController {

    @Autowired
    AccountsService service;


    @RequestMapping(value = "/accounts", method = RequestMethod.GET)
    public String showAccountsPage(ModelMap model) throws ClassNotFoundException, SQLException {

        model.addAttribute("todos", service.retrieveTodos());
        return "accounts";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showAccountsPage2(ModelMap model) throws ClassNotFoundException, SQLException {

        model.addAttribute("todos", service.retrieveTodos());

        List<Customer> filteredTodos = new ArrayList<Customer>();

        filteredTodos = (List) model.get("todos");

        if(filteredTodos.size() > 0) {
            model.put("id", filteredTodos.get(0).getCustno());
            model.put("name", filteredTodos.get(0).getCustname());
            model.put("dep", filteredTodos.get(0).getCdep());
            model.put("years", filteredTodos.get(0).getNyears());
            model.put("savtype", filteredTodos.get(0).getSavtype());
        }
        return "accounts";
    }

//    @RequestMapping(value ="/add-todo", method = RequestMethod.POST)
//    public String addTodo(ModelMap model, @RequestParam String catcode, @RequestParam String catdesc) {
//        service.addTodo(catcode, catdesc);
//
//        model.clear();
//        return "redirect:/category";
//    }
}
