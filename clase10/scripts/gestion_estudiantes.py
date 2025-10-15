
import csv

class Student:
    def __init__(self, name, age, student_id):
        self.name = name
        self.age = age
        self.student_id = student_id
        self.grades = []

    def get_student_info(self):
        return f"Name: {self.name}, Age: {self.age}, ID: {self.student_id}"

    def add_grade(self, grade):
        self.grades.append(grade)

    def get_average_grade(self):
        if not self.grades:
            return 0
        return sum(self.grades) / len(self.grades)

class Group:
    def __init__(self, name):
        self.name = name
        self.students = []

    def add_student(self, student):
        self.students.append(student)

    def remove_student(self, student):
        if student in self.students:
            self.students.remove(student)

    def show_all_students_info(self):
        if not self.students:
            print("El grupo no tiene estudiantes registrados.")
            return
        
        print(f"\n--- Listado de Estudiantes del Grupo: {self.name} ---")
        for student in self.students:
            # Reutilizamos los métodos de la clase Student
            info = student.get_student_info()
            avg = student.get_average_grade()
            print(f"{info}, Promedio: {avg:.2f}") 
    
    def get_student_by_id(self, student_id):
        for student in self.students:
            if student.student_id.lower() == student_id.lower():
                return student
        return None
    
    def get_pass_fail_counts(self, passing_grade):
        if not self.students:
            return (0, 0) # Si no hay estudiantes, nadie aprobó ni reprobó
        passed_count = 0
        failed_count = 0        
        for student in self.students:
            if student.get_average_grade() >= passing_grade:
                passed_count += 1
            else:
                failed_count += 1        
        return (passed_count, failed_count)
    
    def get_top_student(self):
        if not self.students:
            return None
        # Asumimos que el primer estudiante es el mejor inicialmente
        top_student = self.students[0]
        # Comparamos con el resto
        for student in self.students[1:]:
            if student.get_average_grade() > top_student.get_average_grade():
                top_student = student
        return top_student
    
    def get_group_average(self):
        if not self.students:
            return 0
        total = 0
        for student in self.students:
            total += student.get_average_grade()
        return total / len(self.students)
    
    def get_students_sorted_by_grade(self, descending=True):
        return sorted(self.students, key=lambda s: s.get_average_grade(), reverse=descending)

def load_students_from_csv(file_path):
    students_list = []
    with open(file_path, mode='r', encoding='utf-8') as csvfile:
        reader = csv.reader(csvfile, delimiter=';')
        next(reader) # Omitir la cabecera (name;age;student_id;grades)        
        for row in reader:
            # row -> ['Valentina', '20', 'S12345', '4.25,4.50,3.90']
            name, age, student_id, grades_str = row
            grades_list = grades_str.split(',')
            
            # Creamos la instancia de Student
            student = Student(name, int(age), student_id)
            # Añadimos las notas
            for grade in grades_list:
                student.add_grade(float(grade))
            students_list.append(student)            
    return students_list

def save_students_to_csv(file_path, group):
    """
    Guarda la lista de estudiantes de un grupo en un archivo CSV.
    """
    with open(file_path, mode='w', newline='', encoding='utf-8') as csvfile:
        writer = csv.writer(csvfile, delimiter=';')

        # Escribir la cabecera
        writer.writerow(['name', 'age', 'student_id', 'grades'])

        # Escribir los datos de cada estudiante
        for student in group.students:
            grades_str = ",".join([str(g) for g in student.grades])
            writer.writerow([student.name, student.age, student.student_id, grades_str])
    print(f"Datos guardados exitosamente en {file_path}")



if __name__ == "__main__":
    # 1. Cargar los datos usando nuestra función
    lista_de_estudiantes = load_students_from_csv('grades.csv')
    
    # 2. Crear un grupo
    curso_programacion = Group("Programación para Dummies")
    
    # 3. Poblar el grupo con los estudiantes cargados
    for estudiante in lista_de_estudiantes:
        curso_programacion.add_student(estudiante)
        
    # Ahora ya puedes trabajar con el objeto 'curso_programacion'
    print(f"Grupo: {curso_programacion.name}")
    print(f"Número de estudiantes: {len(curso_programacion.students)}")
    print(f"Primer estudiante: {curso_programacion.students[0].name}")