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
			if( JOptionPane.showConfirmDialog(null, "O candidato escolhido foi "+presidente+ ". Deseja confirmar seu voto?","Confirmacao", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
				JOptionPane.showMessageDialog(null, "Voto computado !");
				F++;
				votos++;
			}else{
				JOptionPane.showMessageDialog(null, "Voto cancelado !");
				votoscancelados++;
				F=0;
			}
		}
		if(candidato==43) {
			presidente = "Jeane";
			if( JOptionPane.showConfirmDialog(null, "O candidato escolhido foi "+presidente+ ". Deseja confirmar  seu voto?","Confirmacao", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
				JOptionPane.showMessageDialog(null, "Voto computado !");
				J++;
				votos++;
			}else{
				JOptionPane.showMessageDialog(null, "Voto cancelado !");
				votoscancelados++;
				J=0;
			}
		}
		if(candidato==45) {
			presidente = "Roberto";
			if( JOptionPane.showConfirmDialog(null, "O candidato escolhido foi "+presidente+ ". Deseja confirmar  seu voto?","Confirmacao", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
				JOptionPane.showMessageDialog(null, "Voto computado !");
				R++;
				votos++;
			}else{
				JOptionPane.showMessageDialog(null, "Voto cancelado !");
				votoscancelados++;
				R=0;
			}
		}
		if(candidato==50) {
			presidente = "Osvaldo";
			if( JOptionPane.showConfirmDialog(null, "O candidato escolhido foi "+presidente+ ". Deseja confirmar  seu voto?","Confirmacao", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
				JOptionPane.showMessageDialog(null, "Voto computado !");
				O++;
				votos++;
			}else{
				JOptionPane.showMessageDialog(null, "Voto cancelado !");
				votoscancelados++;
				O=0;
			}
		}else if((candidato != 13)&&(candidato != 43)&&(candidato != 45)&&(candidato != 50)){
			if(JOptionPane.showConfirmDialog(null, "Deseja votar nulo ?","AVISO",JOptionPane.YES_NO_OPTION ) == JOptionPane.YES_OPTION) {
				JOptionPane.showMessageDialog(null, "Voto computado !");
				votosnulo++;
				votos++;
			}else{
				JOptionPane.showMessageDialog(null, "Voto cancelado !");
				votoscancelados++;
			}
		}
		
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
		if((pF == pJ)^(pF == pR)^(pF == pO)) {
			pM = "\n\nNinguem. Deu empate teremos 2 turno";
		}else if((pJ == pF)^(pJ == pR)^(pJ == pO)) {
			pM = "\n\nNinguem. Deu empate teremos 2 turno";
		}else if((pR == pF)^(pR == pJ)^(pR == pO)) {
			pM = "\n\nNinguem. Deu empate teremos 2 turno";
		}else if((pO == pF)^(pO == pJ)^(pO == pR)) {
			pM = "\n\nNinguem. Deu empate teremos 2 turno";
		}
		}while(JOptionPane.showConfirmDialog(null, "Deseja fazer mais um voto ?","AVISO",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION);
		JOptionPane.showMessageDialog(null,"\n                            R E S U L T A D O\n"+"\nFernando - votos: "+F+"  |  percentual de votos:  "+pF+"%"+"\nJeane - votos: "+J+"  |  percentual de votos:   "+pJ+"%"+"\nRoberto - votos: "+R+"  |  percentual de votos:  "+pR+"%"+"\nOsvaldo- votos: "+O+"  |  percentual de votos:  "+pO+"%"+"\n \nA quantidade de votos totais foram "+votos+"\nA quantidade de fotos nulos foram  "+votosnulo+"\nA quantidade de votos cancelados foram  "+votoscancelados+"\n \n              O novo presidente é:  "+pM+" !");
		} 
	
	}

//Obs: testes comecando com numeros fora dos candidatos apresenta erro

