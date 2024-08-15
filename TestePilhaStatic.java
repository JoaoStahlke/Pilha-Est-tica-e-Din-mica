public class TestePilhaStatic {
    public static void main(String[] args) {
        PilhaStatic<Integer> pilha = new PilhaStatic<>(5);

        // Testando push
        System.out.println("Adicionando elementos na pilha.");
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        System.out.println("Topo da pilha: " + pilha.peek());

        // Testando pop
        System.out.println("Removendo elemento do topo.");
        System.out.println("Elemento removido: " + pilha.pop());
        System.out.println("Novo topo da pilha: " + pilha.peek());

        // vazia
        System.out.println("Esvaziando a pilha.");
        pilha.pop();
        pilha.pop();
        System.out.println("A pilha está vazia?: " + pilha.isEmpty());

        // Tentativa remover pilha vazia
        System.out.println("Tentando remover de uma pilha vazia.");
        Integer elementoRemovido = pilha.pop();
        if (elementoRemovido == null) {
            System.out.println("Pilha vazia, nenhum elemento removido.");
        }

        // Testando pilha cheia
        System.out.println("Preenchendo a pilha até o limite.");
        pilha.push(40);
        pilha.push(50);
        pilha.push(60);
        pilha.push(70);
        pilha.push(80);
        System.out.println("A pilha está cheia? " + pilha.isFull());

        // Tentativa add pilha cheia
        System.out.println("Tentando adicionar em uma pilha cheia.");
        pilha.push(90);
        if (pilha.isFull()) {
            System.out.println("Pilha cheia, não foi possível adicionar mais elementos.");
        }
    }
}
