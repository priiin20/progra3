

// Karen Roxana Roldán Hernandez        0901-17-63


package arbolBB;

import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ArbolAVL {

    private NodoArbolAVL raiz; // se declara el nodo raiz 
    private int alt;
    public ArbolAVL() {//costructor  inicializado en nulo
        raiz = null;
    }
    
    public NodoArbolAVL obtenerRaiz(){// se encarga de obtener el nodo de la raiz
        return raiz;
    }
 
    public NodoArbolAVL getRaiz() {// odtiene la raiz
        return raiz;
    }
    
    public void setRaiz(NodoArbolAVL raiz) {
        this.raiz = raiz;
    }
    //Busqueda de nodo r con el dato d
    public NodoArbolAVL Buscar(int d, NodoArbolAVL r) {
        if (raiz == null) {
            return null;
        } else if (r.dato == d) {
            return r;// si  el dato r = d entonces retorna el valor
        } else if (r.dato < d) {// Si el dato del nodo es < al buscado entonces se busca por la derecha
            return Buscar(d, r.hijoDerecho);
        } else {

            return Buscar(d, r.hijoIzquierdo);// Si el dato del nodo es > al buscado entonces se busca por la izquierda
        }
    }
    //Obtener el Factor de Equilibrio
    public int obtenerFE(NodoArbolAVL x) {
        if (x == null) {
            return -1;//Retornamos -1 si el nodo es hoja, es decir es nulo en sus aristas
        } else {
            return x.fe;//Si no retornamos el Factor de Equilibrio del nodo
        }
    }
    //Rotación Simple Izquierda
    public NodoArbolAVL rotacionIzquierda(NodoArbolAVL c) {
        NodoArbolAVL auxiliar = c.hijoIzquierdo;
        c.hijoIzquierdo = auxiliar.hijoDerecho;// el hijoizquierdo ahora es el auxiliar
        auxiliar.hijoDerecho = c;// el hijoderecho se iguala a c
        c.fe = Math.max(obtenerFE(c.hijoIzquierdo), obtenerFE(c.hijoDerecho)) + 1;// el factor de equilibrio es el nivel +1 por eso se pone +1
        //Se establece el FE del nodo auxiliar
        auxiliar.fe = Math.max(obtenerFE(auxiliar.hijoIzquierdo), obtenerFE(auxiliar.hijoDerecho)) + 1;// se saca el facto de equilibrio al auxiliar
        return auxiliar;
    }

    //Rotación Simple Derecha
    public NodoArbolAVL rotacionDerecha(NodoArbolAVL c) {
        NodoArbolAVL auxiliar = c.hijoDerecho;// el nodo que en este caso es c ahora esta a la derecha
        c.hijoDerecho = auxiliar.hijoIzquierdo;
        auxiliar.hijoIzquierdo = c;
        c.fe = Math.max(obtenerFE(c.hijoIzquierdo), obtenerFE(c.hijoDerecho)) + 1;//  se realiza el factor de equilibrio para que se obtenga el maximo valor
        auxiliar.fe = Math.max(obtenerFE(auxiliar.hijoIzquierdo), obtenerFE(auxiliar.hijoDerecho)) + 1;
        return auxiliar;
    }
    
    //Rotación Doble a la Izquierda
    public NodoArbolAVL rotacionDobleIzquierda(NodoArbolAVL c) {
        NodoArbolAVL temporal;// puntero temporal
        c.hijoIzquierdo = rotacionDerecha(c.hijoIzquierdo);// se llama a la rotacionderecha y se manda de parametro hijoizquierdo
        temporal = rotacionIzquierda(c);//se llama a rotacionizquierdasimple y se envia de parametro c
        return temporal;
    }

    //Rotación Doble a la Derecha
    public NodoArbolAVL rotacionDobleDerecha(NodoArbolAVL c) {
        NodoArbolAVL temporal;
        c.hijoDerecho = rotacionIzquierda(c.hijoDerecho);
        temporal = rotacionDerecha(c);
        return temporal;
    }

    // metodo que se utiliza para insertar AVL
    public NodoArbolAVL insertarAVL(NodoArbolAVL nuevo, NodoArbolAVL subArbol) {
        NodoArbolAVL nuevoPadre = subArbol;// se crea un puntero nuevo de tipo arbol
        if (nuevo.dato < subArbol.dato) {//Si el  dato que se ingreso es menor al dato del subarbol
            if (subArbol.hijoIzquierdo == null) {
                subArbol.hijoIzquierdo = nuevo; //sera igual al dato que nos acaban de insertar
            } else {
                subArbol.hijoIzquierdo = insertarAVL(nuevo, subArbol.hijoIzquierdo);// se llama a insertar avl enviandole de parametro nuevo y arbol.izquierdo
     
                if (((obtenerFE((subArbol.hijoIzquierdo))) - (obtenerFE(subArbol.hijoDerecho))) == 2) {// el factor de equilibrio tiene que ser  igual a 2 
                    if (nuevo.dato < subArbol.hijoIzquierdo.dato) {// cuando nuevo dato es menor que el hijo izquierdo
                        nuevoPadre = rotacionIzquierda(subArbol);//llamamos a rotacionizquierda
                    } else {
                        nuevoPadre = rotacionDobleIzquierda(subArbol);// llamamos a rotacionDobleIzquierda;
                    }
                }
            }
        }else if(nuevo.dato>subArbol.dato){//Si es mayor el dato entonces se inserta a la derecha 
            if(subArbol.hijoDerecho==null){
                subArbol.hijoDerecho=nuevo;// se le asigna nuevo nodo
            }else{  
                subArbol.hijoDerecho=insertarAVL(nuevo,subArbol.hijoDerecho);
                if (((obtenerFE((subArbol.hijoDerecho))) - (obtenerFE(subArbol.hijoIzquierdo))) == 2) {
                    if (nuevo.dato > subArbol.hijoDerecho.dato) {
                        nuevoPadre = rotacionDerecha(subArbol);// se llama a rotacionDerecha del arbol
                    } else {
                        nuevoPadre = rotacionDobleDerecha(subArbol);// se llamara a rotacionDobleDerecha
                    }
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "EL NODO ESTA DUPLICADO", "", JOptionPane.PLAIN_MESSAGE);
        }
        
        if((subArbol.hijoIzquierdo==null)&&(subArbol.hijoDerecho!=null)){// se actualiza el factor de equilibrio
            subArbol.fe=subArbol.hijoDerecho.fe+1;// se actualiza y balancea su factor de equilibrio
        }else if((subArbol.hijoDerecho==null)&&(subArbol.hijoIzquierdo!=null)){
            subArbol.fe=subArbol.hijoIzquierdo.fe+1;// se actualiza el factor de equilibrio 
        }else{  
            subArbol.fe=Math.max(obtenerFE(subArbol.hijoIzquierdo), obtenerFE(subArbol.hijoDerecho))+1;
        }
        return nuevoPadre;
    }
    
    
    //Método para insertar
    public void Insertar(int d){
        NodoArbolAVL nuevo=new NodoArbolAVL(d);
        if(raiz==null){
            raiz=nuevo;
        }else{
            raiz=insertarAVL(nuevo,raiz);// llamamos a insertar y le mandamos de dato el nuevo y raiz
        }
    } 
    
     //Recorrido preorden, recibe el nodo a empezar (raiz) y una linkedlist para ir guardando el recorrido
    public LinkedList preOrden() {
        LinkedList rec = new LinkedList();
        preorden(raiz, rec);
        return rec;
    }
    
    public void preorden(NodoArbolAVL aux, LinkedList recorrido) {
        if (aux != null) {
            recorrido.add(aux.getDato());
            preorden(aux.getHijoIzquierdo(), recorrido);
            preorden(aux.getHijoDerecho(), recorrido);
        }
    }

    //Recorrido inorden, recibe el nodo a empezar (raiz) y una linkedlist para ir guardando el recorrido
    public LinkedList inOrden() {
        LinkedList rec = new LinkedList();
        inorden(raiz, rec);
        return rec;
    }
    
    public void inorden(NodoArbolAVL aux, LinkedList recorrido) {
        if (aux != null) {
            inorden(aux.getHijoIzquierdo(), recorrido);
            recorrido.add(aux.getDato());
            inorden(aux.getHijoDerecho(), recorrido);
        }
    }

    //Recorrido postorden, recibe el nodo a empezar (raiz) y una linkedlist para ir guardando el recorrido
    public LinkedList postOrden() {
        LinkedList rec = new LinkedList();
        postorden(raiz, rec);
        return rec;
    }
    public void postorden(NodoArbolAVL aux, LinkedList recorrido) {
        if (aux != null) {
            postorden(aux.getHijoIzquierdo(), recorrido);
            postorden(aux.getHijoDerecho(), recorrido);
            recorrido.add(aux.getDato());
        }
    }
    public boolean agregar(int dato) {
        Insertar(dato);
        return true;
    }
    //Metodo para verificar si hay un nodo en el arbol
    public boolean existe(int dato) {
        NodoArbolAVL aux = raiz;
        while (aux != null) {
            if (dato == aux.getDato()) {
                return true;
            } else if (dato > aux.getDato()) {
                aux = aux.getHijoDerecho();
            } else {
                aux = aux.getHijoIzquierdo();
            }
        }
        return false;
    }
    //Se calcula la altura del arbol
    private void altura(NodoArbolAVL aux, int nivel) {
        if (aux != null) {
            altura(aux.getHijoIzquierdo(), nivel + 1);
            alt = nivel;
            altura(aux.getHijoDerecho(), nivel + 1);
        }
    }

    //Devuleve la altura del arbol
    public int getAltura() {
        altura(raiz, 1);
        return alt;
    }
    
     public JPanel getdibujo() {
        return new ArbolExpresionGrafico(this);
    }
}
