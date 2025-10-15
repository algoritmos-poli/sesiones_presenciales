from gestion_estudiantes import Group, Student, load_students_from_csv, save_students_to_csv

def teacher_menu(group_object):
    """Muestra el menú y maneja las interacciones para el profesor."""
    print("\n--- Bienvenido, Profesor ---")
    
    while True:
        print("\n--- Menú del Profesor ---")
        print("1. Ver ranking de estudiantes")
        print("2. Ver estadísticas del grupo (Promedio y Aprobados/Reprobados)")
        print("3. Buscar un estudiante por ID")
        print("4. Agregar nuevo estudiante")
        print("5. Guardar cambios y salir")
        print("6. Salir sin guardar")

        choice = input("Selecciona una opción: ")

        # --- Opción 1: Ver Ranking ---
        if choice == '1':
            print("\n--- Ranking de Estudiantes (Mejor a Peor) ---")
            ranked_students = group_object.get_students_sorted_by_grade()
            if not ranked_students:
                print("No hay estudiantes en el grupo.")
            else:
                for i, student in enumerate(ranked_students, 1):
                    avg = student.get_average_grade()
                    print(f"{i}. {student.name} - Promedio: {avg:.2f}")

        # --- Opción 2: Estadísticas ---
        elif choice == '2':
            print("\n--- Estadísticas del Grupo ---")
            group_avg = group_object.get_group_average()
            print(f"Promedio general del grupo: {group_avg:.2f}")                         
            passed, failed = group_object.get_pass_fail_counts(3.0)
            print(f"- Estudiantes Aprobados: {passed}")
            print(f"- Estudiantes Reprobados: {failed}")
            
        # --- Opción 3: Buscar Estudiante ---
        elif choice == '3':
            id_to_find = input("Ingresa el ID del estudiante a buscar: ")
            student = group_object.get_student_by_id(id_to_find)
            if student:
                print("\n--- Información del Estudiante ---")
                print(student.get_student_info())
                print(f"Notas: {student.grades}")
                print(f"Promedio: {student.get_average_grade():.2f}")
            else:
                print(f"No se encontró ningún estudiante con el ID '{id_to_find}'.")
        
        # --- Opción 4: Agregar Estudiante ---
        elif choice == '4':
            print("\n--- Agregar Nuevo Estudiante ---")
            name = input("Nombre: ")
            try:
                age = int(input("Edad: "))
                student_id = input("ID de estudiante (ej: S99999): ")
                # Validar que el ID no exista
                if group_object.get_student_by_id(student_id):
                    print("Error: Ya existe un estudiante con ese ID.")
                    continue
                
                new_student = Student(name, age, student_id)
                new_student.grades = [0,0,0]  # Inicializar la lista de notas
                group_object.add_student(new_student)
                print(f"¡Estudiante '{name}' agregado exitosamente!")
            except ValueError:
                print("Error: La edad debe ser un número.")

        # --- Opción 5: Guardar y Salir ---
        elif choice == '5':
            try:
                save_students_to_csv('grades.csv', group_object)
                print("Saliendo del programa...")
                break
            except Exception as e:
                print(f"Ocurrió un error al guardar: {e}")

        # --- Opción 6: Salir sin Guardar ---
        elif choice == '6':
            confirm = input("¿Estás seguro? Perderás los cambios no guardados (s/n): ")
            if confirm.lower() == 's':
                print("Saliendo del programa...")
                break
        
        else:
            print("Opción no válida. Por favor, intenta de nuevo.")


def student_menu(student_object):
    """Muestra el menú y maneja las interacciones para un estudiante."""
    print(f"\n--- Bienvenido, {student_object.name} ---")
    while True:
        print("\n1. Ver mis notas")
        print("2. Ver mi promedio")
        print("3. Salir")
        choice = input("Selecciona una opción: ")

        if choice == '1':
            print(f"Tus notas son: {student_object.grades}")
        elif choice == '2':
            print(f"Tu promedio es: {student_object.get_average_grade():.2f}")
        elif choice == '3':
            break
        else:
            print("Opción no válida.")

def main():
    """Función principal que inicia el programa y maneja el login."""
    file_name = 'grades.csv'
    try:
        students = load_students_from_csv(file_name)
        curso = Group("Curso de Estructuras de Datos")
        for s in students:
            curso.add_student(s)
    except FileNotFoundError:
        print(f"Error: Archivo '{file_name}' no encontrado. Iniciando con un grupo vacío.")
        curso = Group("Curso de Estructuras de Datos")

    print("--- Sistema de Gestión Académica ---")
    user_id = input("Ingresa tu ID de estudiante o 'admin' para el profesor: ")

    if user_id.lower() == 'admin':
        teacher_menu(curso)
    else:
        current_student = curso.get_student_by_id(user_id)
        if current_student:
            student_menu(current_student)
        else:
            print("ID de estudiante no encontrado.")

if __name__ == "__main__":
    main()