public class TestePilhaDynamic {
    public static void main(String[] args) {
        PilhaDynamic<Integer> pilha = new PilhaDynamic<>();

        // push
        System.out.println("Adicionando elementos na pilha.");
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        System.out.println("Topo da pilha: " + pilha.peek());

        // pop
        System.out.println("Removendo elemento do topo.");
        System.out.println("Elemento removido: " + pilha.pop());
        System.out.println("Novo topo da pilha: " + pilha.peek());

        // vazia
        System.out.println("Esvaziando a pilha.");
        pilha.pop();
        pilha.pop();
        System.out.println("A pilha está vazia?: " + pilha.isEmpty());

        // Tentativa pilha vazia
        System.out.println("Tentando remover de uma pilha vazia.");
        Integer elementoRemovido = pilha.pop();
        if (elementoRemovido == null) {
            System.out.println("Pilha vazia, nenhum elemento removido.");
        }

        // Tentativa consultar topo pilha vazia
        System.out.println("Tentando consultar o topo de uma pilha vazia.");
        Integer topo = pilha.peek();
        if (topo == null) {
            System.out.println("Pilha vazia, nenhum elemento no topo.");
        }
    }
}
