import java.util.ArrayList;
import java.util.List;


public class ListaTarefa {
    //Atributo
    public List<Tarefa>tarefaList;

    public ListaTarefa(){
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa>tarefaParaRemover = new ArrayList<>();
        for(Tarefa t : tarefaList){
            if(t.getDescriacao().equalsIgnoreCase(descricao)){
                tarefaParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefaParaRemover);
    }
    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }
    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }
    

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("Número total de elementos na lista é:"+listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.adicionarTarefa("Tarefa1");
        listaTarefa.adicionarTarefa("Tarefa1");
        listaTarefa.adicionarTarefa("Tarefa2");
        System.out.println("Número total de elementos na lista é:"+listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.removerTarefa("Tarefa1");
        System.out.println("Número total de elementos na lista é:"+listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.obterDescricoesTarefas();

    }


}
