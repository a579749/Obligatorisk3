package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;



public class Blogg {
	
	
	Innlegg[] innleggstabell;
	int nestledig;
	
	

	public Blogg() {
		Innlegg[] innleggstabell=new Innlegg[20];
	}

	public Blogg(int lengde) {
		Innlegg[] innleggstabell=new Innlegg[lengde];
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
	
	public int finnInnlegg(Innlegg innlegg) {

		for(int i=0; i<innleggstabell.length; i++){
			if(innleggstabell[i].getId()==innlegg.getId()){
				return i;
			}	
		}
		return -1;
		
	}

	public boolean finnes(Innlegg innlegg) {
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
	
	public boolean leggTil(Innlegg innlegg) {

		
			if(!finnes(innlegg)){
				for(int i=0; i<innleggstabell.length; i++){
					if(innleggstabell[i]==null){
						innleggstabell[i]=innlegg;
						return true;
					}
				}
			}
		
			return false;
		

		
	}
	
	public String toString() {
		String a="";
		for(int i=0; i<innleggstabell.length;){
			if(i==0){
				a=getAntall()+"\n"+innleggstabell[i].getBruker()+"\n"+innleggstabell[i].getDato()+"\n"+innleggstabell[i].getId()+"\n"+innleggstabell[i].getLikes()+"\n";
				i++;
			}
			a+=innleggstabell[i].getBruker()+"\n"+innleggstabell[i].getDato()+"\n"+innleggstabell[i].getId()+"\n"+innleggstabell[i].getLikes()+"\n";
			i++;
			
			return getAntall()+"\n"+innleggstabell[i].getBruker();
		}
		
		throw new UnsupportedOperationException(TODO.method());
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