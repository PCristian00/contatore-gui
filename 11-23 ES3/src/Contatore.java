public class Contatore {
private int count=0;

public void incCount() {
	count++;
}

public void decCount() {
	count--;
}

public void zeroCount() {
	count=0;
}
public String toString() {
	return ("CONTATORE:\n"+this.count);
}

}