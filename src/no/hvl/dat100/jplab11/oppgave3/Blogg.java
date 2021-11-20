package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;
import no.hvl.dat100.jplab11.oppgave2.*;


public class Blogg {
	
	
	Bilde[] innleggstabell;
	Tekst[] innleggstabellskrrt;
	int nestledig;
	
	
	
	public Blogg() {
		innleggstabell=new Bilde[20];
	}

	public Blogg(int lengde) {
		innleggstabell=new Bilde[lengde];
	}

	public int getAntall() {
		int x=0;
		for(int i=0; i<innleggstabell.length; i++){
			if (innleggstabell[i]!=null){
				x++;
			}
		}
		return x;
	}
	
	public Innlegg[] getSamling() {
		return innleggstabell;
	}
	
	public int finnInnlegg(Bilde innlegg) {

		for(int i=0; i<innleggstabell.length; i++){
			if(innleggstabell[i].getId()==innlegg.getId()){
				return i;
			}	
		}
		return -1;
		
	}

	public boolean finnes(Bilde innlegg) {
		for(int i=0; i<innleggstabell.length; i++){
			if(innleggstabell[i].getId()==innlegg.getId()){
				return true;
			}	
		}
		return false;
	}
	public boolean finnes(Tekst innlegg) {
		for(int i=0; i<innleggstabell.length; i++){
			if(innleggstabell[i].getId()==innlegg.getId()){
				return true;
			}	
		}
		return false;
	}

	public boolean ledigPlass() {
		for(int i=0; i<innleggstabell.length; i++){
			if(innleggstabell[i]==null){
				return true;
			}
		
		}
		return false;
	}
	
	public boolean leggTil(Bilde innlegg) {

		if(innlegg instanceof Innlegg){
			if(!finnes(innlegg)){
				for(int i=0; i<innleggstabell.length; i++){
					if(innleggstabell[i]==null){
						innleggstabell[i]=(Bilde)innlegg;
						return true;
					}
				}
			}
		}
			return false;
		
	}
	public boolean leggTil(Tekst innlegg) {

		if(innlegg instanceof Innlegg){
			if(!finnes(innlegg)){
				for(int i=0; i<innleggstabell.length; i++){
					if(innleggstabell[i]==null){
						innleggstabellskrrt[i]=(Tekst)innlegg;
						return true;
					}
				}
			}
		}
			return false;
		
	}
	
	public String toString() {
		String a="";
		for(int i=0; i<getAntall();){
			if(i==0){
				a+=getAntall()+"\n"+innleggstabell[i].getBruker()+"\n"+innleggstabell[i].getDato()+"\n"+innleggstabell[i].getId()+"\n"+innleggstabell[i].getLikes()+"\n";
				i++;
			}
			a+=innleggstabell[i].getTekst()+"\n"+"BILDE"+"\n"+innleggstabell[i].getId()+"\n"+innleggstabell[i].getBruker()+"\n"+innleggstabell[i].getDato()+"\n"+innleggstabell[i].getLikes()+"\n"+innleggstabell[i]+"\n"+"et bilde"+"\n"+innleggstabell[i].getUrl()+"\n";
			i++;
			
			
		}
		
		return a;
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}