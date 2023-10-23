document.addEventListener("DOMContentLoaded", function () {
    const searchInputPizzas = document.getElementById('search-pizzas');
    const resultsListPizzas = document.getElementById('results-pizzas');
    const searchInputBebidas = document.getElementById('search-bebidas');
    const resultsListBebidas = document.getElementById('results-bebidas');

    searchInputPizzas.addEventListener('input', () => {
        query = searchInputPizzas.value.trim().toLowerCase();
        if (query === '') {
            resultsListPizzas.style.display = 'none';
            return;
        }


        results = ['Quatro queijos', 'Dois queijos', 'Brocolis', 'Frango', 'Camarão', 'Bahiana', 'Moda da casa'];

        resultsListPizzas.innerHTML = '';

        results.forEach(result => {

            li = document.createElement('li');
            li.textContent = result;
            resultsListPizzas.appendChild(li);
        });

        resultsListPizzas.style.display = 'block';
    });

    searchInputBebidas.addEventListener('input', () => {
        query = searchInputBebidas.value.trim().toLowerCase();
        if (query === '') {
            resultsListBebidas.style.display = 'none';
            return;
        }

        results = ['Suco de Uva', 'Suco de Laranja', 'Coca-Cola', 'Guarana', 'Pepsi', 'Suco de maracuja', 'Suco de pitaia'];

        resultsListBebidas.innerHTML = '';

        results.forEach(result => {
            li = document.createElement('li');
            li.textContent = result;
            resultsListBebidas.appendChild(li);
        });

        resultsListBebidas.style.display = 'block';
    });
});