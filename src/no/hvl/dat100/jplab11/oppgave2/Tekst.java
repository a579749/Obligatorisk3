package no.hvl.dat100.jplab11.oppgave2;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Tekst extends Innlegg {

	private String tekst;
	private int id;
	private String bruker;
	private String dato;
	private int likes;

	public Tekst () {
		
	}
	
	public Tekst(int id, String bruker, String dato, String tekst) {
		this.id=id;
		this.bruker=bruker;
		this.dato=dato;
		this.likes=0;
		this.tekst=tekst;
		
	}
	
	public Tekst(int id, String bruker, String dato, int likes, String tekst) {
		this.id=id;
		this.bruker=bruker;
		this.dato=dato;
		this.likes=likes;
		this.tekst=tekst;
	}
	
	public String getTekst() {
		return tekst;
	}

	public void setTekst(String tekst) {
		this.tekst=tekst;
		
	}

	@Override
	public String toString() {
		return getTekst()+"\n"+getId()+"\n"+getBruker()+"\n"+getDato()+"\n"+getLikes()+"\n"+getTekst()+"\n";

	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
			
		throw new UnsupportedOperationException(TODO.method());
				
	}
}

