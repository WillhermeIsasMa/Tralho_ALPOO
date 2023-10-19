@autowired
@getter
@setter
public class Cliente {
    private String email, nome, enderecoEntrega;
    private int cpf, telefone;
    
    boolean public logar(){
        return false;
    }
    
    boolean public resetSenha(){
        return false;
    }

    public void cliente(String email, String nome, String enderecoEntrega, int cpf, int telefone){
        this.email=email;
        this.nome=nome;
        this.enderecoEntrega=enderecoEntrega;
        this.cpf=cpf;
        this.telefone=telefone;
    }

}
