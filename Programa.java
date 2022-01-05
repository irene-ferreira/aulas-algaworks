package exercicios;

import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				System.out.println("-----URNA-----"); 
			System.out.println("(1) Shaban");
			System.out.println("(2) Meneses Cirilo");
			System.out.println("(3) Eusebio");
			System.out.println("(4) Binga");
			System.out.println("(5) Dorivaldo");
			System.out.println("(6) Irene");
			System.out.println("(7) Madalena");
			System.out.println("(8) Culyssander");
			System.out.println("(9) Januelma");
			System.out.println("(10) Florinda");
			System.out.println("(0) Branco ou Nulo");
			System.out.println("(-1) para sair " );
			System.out.println("-----URNA-----"); 
			
			int voto=sc.nextInt();
			int votosShaban=0;
			int votosMenesesCirilo=0;
			int votosEusebioDeSousa=0;
			int votosBinga=0;
			int votosDorivaldo=0;
			int votosIrene=0;
			int votosMadalena=0;
			int votosCulyssander=0;
			int votosJanuelma=0;
			int votosFlorinda=0;
			int c=0;
			int votoTotal=0;
			int votosBrancoNulo = 0;
			
			
			
			while(voto>=0) {
				if(voto==1) {
					votosShaban++;
					System.out.println("O seu voto foi computado para o candidato Shaban");
				} else if (voto==2) {
					 votosMenesesCirilo++;
					System.out.println("O seu voto foi computado para o candidato Meneses Cirilo");
				} else if (voto== 3) {
					votosEusebioDeSousa++;
					System.out.println("O seu voto foi computado para o candidato Eusebio de Sousa ");
				} else if (voto== 4) {
					votosBinga++;
					System.out.println("O seu voto foi computado para o candidato Binga");
				} else if (voto== 5) {
					votosDorivaldo++;
					System.out.println("O seu voto foi computado para o candidato Dorivaldo");
				} else if (voto== 6) {
					 votosIrene++;
					System.out.println("O seu voto foi computado para a candidata Irene");
				} else if (voto== 7) {
					votosMadalena++;
					System.out.println("O seu voto foi computado para a candidata Madalena");
				} else if (voto== 8) {
					votosCulyssander++;
					System.out.println("O seu voto foi computado para o candidato Culyssander");
				} else if (voto== 9) {
					votosJanuelma++;
					System.out.println("O seu voto foi computado para a candidata Januelma");
				} else if (voto== 10) {
					votosFlorinda++;
					System.out.println("O seu voto foi computado para a candidata Florinda");
				} else if (voto== 0) {
					votosBrancoNulo++;
					System.out.println("Você votou Branco ou Nulo");
				} else {
					System.out.println("Candidato (a) incorreto(a), vote novamente ");
				}
				if(voto==1 || voto==2 ||voto==3  ||voto==4 ||voto==5  ||voto==6 ||voto==7  ||voto==8 ||voto==9 ||voto==10 ||voto==0){                                                       
					votoTotal++;
				}
				System.out.println("Vote novamente: ");
		voto = sc.nextInt();
	
			}
			
			System.out.println("-----RESULTADO-----");
			System.out.println("Total = " +votoTotal+" = 100%");
	        double porcShaban = (100*votosShaban)/votoTotal;
			System.out.println("Shaban = " + porcShaban + "%");
			double porcMenesesCirilo = (100*votosMenesesCirilo) /votoTotal;
			System.out.println("Meneses Cirilo = "+ porcMenesesCirilo + "%");
			double porcEusebioDeSousa = (100*votosEusebioDeSousa)/votoTotal;
			System.out.println("Eusebio De Sousa = " + porcEusebioDeSousa + "%");
			double porcBinga = (100*votosBinga)/votoTotal;
			System.out.println("Binga = " + porcBinga + "%");
			double porcDorivaldo = (100*votosDorivaldo)/votoTotal;
			System.out.println("Dorivaldo = " + porcDorivaldo + "%");
			double porcIrene = (100*votosIrene)/votoTotal;
			System.out.println("Irene = "+ porcIrene + "%");
			double porcMadalena = (100*votosMadalena)/votoTotal;
			System.out.println("Madalena = " + porcMadalena + "%");
			double porcCulyssander = (100*votosCulyssander)/votoTotal;
			System.out.println("Culyssander = "+ porcCulyssander + "%");
			double porcJanuelma = (100*votosJanuelma)/votoTotal;
			System.out.println("Januelma = "+ porcJanuelma + "%");
			double porcFlorinda = (100*votosFlorinda)/votoTotal;
			System.out.println("Florinda = "+ porcFlorinda+ "%");
			double porcBrancoNulo = (100 * votosBrancoNulo) / votoTotal;
			System.out.println("Votos em Branco ou Nulo: " + porcBrancoNulo + "%");
			System.out.println("-----RESULTADO-----");
			sc.close();
		}

}
