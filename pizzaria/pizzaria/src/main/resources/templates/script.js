const searchInput = document.getElementById('search');
const resultsList = document.getElementById('results');

searchInput.addEventListener('input', () => {
    const query = searchInput.value.trim().toLowerCase();
    if (query === '') {
        resultsList.style.display = 'none';
        return;
    }

    const results = ['Quatro queijos', 'Dois queijos','Brocolis','Frango','Camarão','Bahiana','Moda da casa'];

    resultsList.innerHTML = '';

    results.forEach(result => {
        const li = document.createElement('li');
        li.textContent = result;
        resultsList.appendChild(li);
    });

    resultsList.style.display = 'block';
});