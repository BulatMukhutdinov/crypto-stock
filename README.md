# Допушения
* Для улучшения пользовательского опыта и для уменьшения кол-ва запросов в сеть, tagline, project_description и official_links грузятся на экране списка
* Для улучшения читабельности на экране списка цена округляется до 2 знаков после запятой
* Для ускорения разраотки была использована библиотека, для отрисовки графиков изменения цены, которая работает только с float значениями. При конвертации из BigDecimal в float может теряться точность