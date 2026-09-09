public class Main {
    public static void main (String[] args) {
       Livro livro1 = new Livro(
               "Dom Casmurro",
               "Machado de Assis",
               1899,
               "978-85-359-0277-5",
               true
       );

       livro1.exibirInformacoes();

        System.out.println("\n --Emprestimo--");
        livro1.emprestar();

        System.out.println("Disponivel: " +livro1.isDisponivel());

        System.out.println("\n --Devolução--");
        livro1.devolver();

        System.out.println("Disponível: " + livro1.isDisponivel());

        System.out.println("\n --Alterando o ano--");
        livro1.setAno(2000);
        System.out.println("Novo ano: " + livro1.getAno());

        System.out.println("\n --Testando ano inválido--");
        livro1.setAno(2030);

    }
}
