package br.ucsal.bes20192.poo.atividade10.domain;

import java.util.HashSet;
import java.util.Iterator;

public class CajuSet<E> extends HashSet<E>{
	
	private static final long serialVersionUID = 1L;

	@Override
	public boolean contains(Object o) {
		Iterator<E> it = iterator();
		while(it.hasNext()) {
			if(it.next().equals(o)) {
				return true;
			}
		}
		return false;
	}

}
