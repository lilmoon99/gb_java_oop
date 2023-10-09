1. Создать package – model. Работу продолжаем в нем 
2. Реализовать абстрактный класс User и его наследники Student и Teacher.
Родитель имеет в себе общие данные (пример: фио, год рождения и тд), а
наследники собственные параметры (какие, по вашему выбору – Пример:
studentId для Student, teacherId для Teacher)
3. Создать package – service. Работу продолжаем в нем
4. Создать класс DataService с методами по управлению сущностями User
   (create, read) и агрегирующий всех пользователей заведенных в системе 
5. StudentId должны быть созданы по алгоритму – максимальный id в
   коллекции + 1. Аналогично и для TeacherId. Здесь решение через перебор
   элементов и instanceOf
6. Создать package – view. Работу продолжаем в нем 
7. Создать класс StudentView, содержащий в себе метод вывода в консоль
   данных студента поданных на вход
8. Создать package – controller. Работу продолжаем в нем 
9. Создать класс Controller агрегирующий в себе необходимые классы в виде
   полей, а инициализируем прям в поле. 
10. Создаем метод созданиеСтудента – реализующий логику, путем вызова
   соответствующих методов интерфейсов:
11. Создания Студента в сервисе 
12. Возвращение всех студентов в сервисе 
13. Вызов view и передача списка найденных студентов

## ДЗ
1. Создать класс УчебнаяГруппа, содержащий в себе поля Преподаватель и список Студентов; 
2. Создать класс УчебнаяГруппаСервис, в котором реализована функция (входные параметры - (Teacher, List<Strudent>)) формирования из Студентов и Преподавателя УчебнойГруппы и возвращения его; 
3. Создать метод в Контроллере, в котором агрегируются функции получения списка студентов (их id) и преподавателя (его id) и формирования учебной группы, путём вызова метода из сервиса; 
4. Всё вышеуказанное создать согласно принципам ООП, пройдённым на семинаре.