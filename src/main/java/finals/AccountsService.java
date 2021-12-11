package finals;

import java.util.ArrayList;
import java.util.List;

public class AccountsService {

    private static List<Customer> todos = new ArrayList<Customer>();
    private static int todoCount = 2;


    static {
        todos.add(new Customer("1407", "Festus Olise", 25000, 8, "Savings-Deluxe"));
        todos.add(new Customer("2803", "Charles Olise", 50000, 4, "Savings-Deluxe"));

    }

    public List<Customer> retrieveTodos() {
        List<Customer> filteredTodos = new ArrayList<Customer>();
        for (Customer todo: todos) {
            filteredTodos.add(todo);
        }

        return filteredTodos;
    }

    public void updateTodo(String custno, String custname, double cdep, int nyears, String savtype) {
        todos.add(new Customer(custno, custname, cdep, nyears, savtype));
    }

    public void deleteTodo(String id) {
        for (int i = 0; i < todos.size(); i++) {
            if(id.equals(todos.get(i).getCustno())) {
                todos.remove(i);
                break;
            }
        }
    }

    public Customer retrieve (String id) {
        for(Customer todo: todos) {
            if(todo.getCustno().equals(id)) {
                return todo;
            }
        }

        return  null;

    }

    public void update(Customer todo) {
        todos.remove(todo);
        todos.add(todo);
    }









}
