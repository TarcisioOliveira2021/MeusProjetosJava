package br.ucsal;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Maratona {
	
	public static void main(String[] args) {
		// Numero dos candidatos 13,43,45,50
		int candidato,F=0,J=0,R=0,O=0,votos=0,votosnulo=0,votoscancelados=0;
		double pF=0,pJ=0,pR=0,pO=0,pN=0;  //percentual de cada candidato !
		String presidente="",pM="";
		do {
		candidato = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero do seu candidato para presidente"));
		if(candidato==13) {
			presidente = "Fernando";
			if( JOptionPane.showConfirmDialog(null, "O candidato escolhido foi "+presidente+ " deseja confirmar seu voto?","Confirmacao", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
				JOptionPane.showMessageDialog(null, "Voto computado !");
			}else{
				JOptionPane.showMessageDialog(null, "Voto cancelado !");
			}
			F++;
		}
		if(candidato==43) {
			presidente = "Jeane";
			if( JOptionPane.showConfirmDialog(null, "O candidato escolhido foi "+presidente+ " deseja confirmar seu voto?","Confirmacao", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
				JOptionPane.showMessageDialog(null, "Voto computado !");
			}else{
				JOptionPane.showMessageDialog(null, "Voto cancelado !");
			}
			J++;
		}
		if(candidato==45) {
			presidente = "Roberto";
			if( JOptionPane.showConfirmDialog(null, "O candidato escolhido foi "+presidente+ " deseja confirmar seu voto?","Confirmacao", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
				JOptionPane.showMessageDialog(null, "Voto computado !");
			}else{
				JOptionPane.showMessageDialog(null, "Voto cancelado !");
			}
			R++;
		}
		if(candidato==50) {
			presidente = "Osvaldo";
			if( JOptionPane.showConfirmDialog(null, "O candidato escolhido foi "+presidente+ " deseja confirmar seu voto?","Confirmacao", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
				JOptionPane.showMessageDialog(null, "Voto computado !");
			}else{
				JOptionPane.showMessageDialog(null, "Voto cancelado !");
			}
			O++;
		}else if((candidato != 13)&&(candidato != 43)&&(candidato != 45)&&(candidato != 50)){
			if(JOptionPane.showConfirmDialog(null, "Deseja votar nulo ?","AVISO",JOptionPane.YES_NO_OPTION ) == JOptionPane.YES_OPTION) {
				JOptionPane.showMessageDialog(null, "Voto computado !");
				votosnulo++;
			}else{
				JOptionPane.showMessageDialog(null, "Voto cancelado !");
				votoscancelados++;
				votos--;
			}
		}
		votos++;
		pF = ((F/votos)*100);
		pJ = ((J/votos)*100);
		pR = ((R/votos)*100);
		pO = ((O/votos)*100);
		pN = ((votosnulo/votos)*100);
		if((pF > pJ)&&(pF > pR)&&(pF > pO)){
			pM = "Fenando"; 
		}else if((pJ > pF)&&(pJ > pR)&&(pJ > pO)) {
			pM = "Jeane";
		}else if((pR > pJ)&&(pR > pF)&&(pR > pO)) {
			pM = "Roberto";
		}else if((pO > pJ)&&(pO > pR)&&(pO > pF)) {
			pM = "Osvaldo";
		}
		}while(JOptionPane.showConfirmDialog(null, "Deseja fazer mais um voto ?","AVISO",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION);
		JOptionPane.showMessageDialog(null,"\n                            R E S U L T A D O\n"+"\nFernando - votos: "+F+".  o percentual de votos foi "+pF+"%"+"\nJeane - votos: "+J+".  o percentual de votos foi "+pJ+"%"+"\nRoberto - votos: "+R+".   o percentual de votos foi "+pR+"%"+"\nOsvaldo- votos: "+O+".   o percentual de votos foi "+pO+"%"+"\n \nA quantidade de votos totais foram "+votos+"\nA quantidade de fotos nulos foram  "+votosnulo+"\nA quantidade de votos cancelados foram  "+votoscancelados+"\n \n              O novo presidente é:  "+pM);
		} 
	
	}

