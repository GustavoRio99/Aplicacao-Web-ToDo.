package br.com.todolist.webtodo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author AntiComuna
 */

@Controller
public class TarefaController {
    
    private List<Tarefa> tarefas = new ArrayList<>();
    
    @GetMapping("/")
    public String listarTarefas(Model model) {
        model.addAttribute("tarefas", tarefas);
        return "index";
    }
    @PostMapping("/adicionar")
    public String adicionarTarefa(@RequestParam String descricao) {
        if (descricao != null && !descricao.trim().isEmpty()) {
            tarefas.add(new Tarefa(descricao));
        }
        return "redirect:/";
    }
    
    @GetMapping("/marcar-concluida/{id}")
    public String marcarConcluida(@PathVariable long id) {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getId() == id) {
                tarefa.setConcluido(true);
                break;
            }
        }
        return "redirect:/";
    }

 
    @GetMapping("/remover/{id}")
    public String removerTarefa(@PathVariable long id) {
        tarefas.removeIf(tarefa -> tarefa.getId() == id);
        return "redirect:/";
    }
    
  @PostMapping("/editar")
public String editarTarefa(@RequestParam("id") long id, @RequestParam("descricao") String novaDescricao) {
    // Itera sobre a lista de tarefas para encontrar a correta
    for (Tarefa tarefa : tarefas) {
        if (tarefa.getId() == id) {
            tarefa.setDescricao(novaDescricao);
            break; 
        }
    }
    return "redirect:/";
}
    
}
  
