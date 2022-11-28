class StudentApp{
	public static void main(String [] args) {

                Sala deMatematica = new Sala("Sala A1.01", 20, true);
                Sala deCiencias = new Sala("Sala A1.02", 18, true);
		Sala deBiologia = new Sala("Sala A1.03", 22, true);
                
                Aula aula1 = new Aula();
                aula1.numero = 1;
                aula1.nome = "Aula 1";
                aula1.sumario = "Sumário da aula 1";
                aula1.numeroAlunos = 20;
                aula1.duracao.horaInicio = 15;
                aula1.duracao.horaFim = 16;
                aula1.duracao.duracao = 60;
                
                System.out.println(deMatematica);
                System.out.println(deCiencias);
                System.out.println(deBiologia);


	}
}

