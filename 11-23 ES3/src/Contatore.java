public class Contatore {
private int count=0;
//Incrementa contatore
public void incCount() {
	count++;
}
//Decrementa contatore
public void decCount() {
	count--;
}
//Azzera Contatore
public void zeroCount() {
	count=0;
}
//Stampa su stringa il contatore
public String toString() {
	return ("CONTATORE:\n"+this.count);
}

}
