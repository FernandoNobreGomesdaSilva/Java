package List;
public class Tarefa {
    //Atributo
    private String descricao;

    public Tarefa(String descricao){
        this.descricao = descricao;
    }
    public String getDescriacao(){
        return descricao;
    }
    @Override
	public String toString() {
		return "Tarefa [descricao=" + descricao  +"]";
	}
}
