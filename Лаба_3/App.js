   
    function Exchange() { //task 1
        var block_first = document.getElementById('block_2left').innerHTML;
        var block_second = document.getElementById('bloock_6text').innerHTML;
        document.getElementById('block_2left').innerHTML = block_second;
        document.getElementById('bloock_6text').innerHTML = block_first;
    }

    function Romb(a, h) { //task 2
        var Square = document.createTextNode(a * h);
        var value = document.getElementById('block_5');
        value.append("Площа ромба: ")
        value.appendChild(Square);
    }

    function Max_num() { //task 3
        var elems= Array.from(document.getElementById("myForm").elements, x => parseInt(x.value));
        var max = elems[0];
        var min = elems[0];
        console.log(elems);
        for (const num of elems) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        if (!isNaN(max) && !isNaN(min)){
            document.cookie = "max=" + max;
            document.cookie = "min=" + min;
        }
    }

    if (document.cookie) {
        if (confirm(document.cookie + " Хочете видалити куки? ")) {
            document.cookie = "max=;expires=Thu, 01 Jan 1970 00:00:00 UTC;";
            document.cookie = "min=;expires=Thu, 01 Jan 1970 00:00:00 UTC;";
        }
    }
    document.styleSheets[0].insertRule("div { border-color:"+ localStorage.getItem('color')+ ";}", 0);
    document.getElementById('area1').value = localStorage.getItem('area1');
    document.getElementById('area2').value = localStorage.getItem('area2');
    document.getElementById('area3').value = localStorage.getItem('area3');

    function Border_color() { //task 4
        let color = document.getElementById('color').value;
        document.styleSheets[0].deleteRule(0);
        document.styleSheets[0].insertRule("div { border-color:"+ color+ ";}", 0);
        localStorage.setItem('color', color);

    }

    function Func_with_focus() { //task 5
        const form = document.getElementById('myForm');

        form.addEventListener('focus', (event) => {
          event.target.style.background = 'grey';
        }, true);
    }

    function Editing_text() { //task 6
        const area1 = document.getElementById('area1');
        const area2 = document.getElementById('area2');
        const area3 = document.getElementById('area3');

        area1.addEventListener('input', (event) => {
            localStorage.setItem('area1', event.target.value )
        }, false);

        area2.addEventListener('input', (event) => {
            localStorage.setItem('area2', event.target.value )
        }, false);

        area3.addEventListener('input', (event) => {
            localStorage.setItem('area3', event.target.value )
        }, false);
    }
 

    function clearArea1()
    {
        localStorage.setItem('area1', 
        'Lorem Ipsum - это текст-"рыба", часто\n'+
        ' используемый в печати и вэб-дизайне.\n'+
        ' Lorem Ipsum является стандартной\n'+
        ' рыбой для текстов на латинице с начала\n' +
        ' XVI века. В то время некий безымянный\n' +
       ' печатник создал большую коллекцию \n'+
        ' размеров и форм шрифтов, используя \n'+
       '  Lorem Ipsum для распечатки образцов.\n'+
        ' Lorem Ipsum не только успешно пережил\n'+
        ' без заметных изменений пять веков, но и\n'+
        ' перешагнул в электронный дизайн. Его\n'+
        ' популяризации в новое время послужили\n'+
        ' публикация листов Letraset с образцами\n'+
        ' Lorem Ipsum в 60-х годах и, в более \n'+
        ' недавнее время, программы электронной\n'+
        ' вёрстки типа Aldus PageMaker, в шаблонах\n'+
        ' которых используется Lorem Ipsum.')
        document.getElementById('area1').value=localStorage.getItem("area1");
    }

    Func_with_focus();
    Editing_text();