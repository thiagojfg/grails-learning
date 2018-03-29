package cadastro

class Cliente {

    Long id
    String nome
    String login
    String senha
    String email

    static constraints = {
        id unique: true
        nome blank: false
        login size: 5..15, blank: false, unique: true
        senha size: 5..15, blank: false, password: true
        email email: true, blank: false
    }

    Long consulta(String nome) {
        return Cliente.countByNomeIlike("%"+nome+"%")
    }


    @Override
    public String toString() {
        return nome
    }
}
