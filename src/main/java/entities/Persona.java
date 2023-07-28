package entities;

import jakarta.persistence.*;

@MappedSuperclass

public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "persona_id")
    private long personaId;
    private String nombre;
    private String dni;

    public Persona() {
    }

    public Persona(long personaId,String nombre, String dni) {
        this.personaId = personaId;
        this.nombre = nombre;
        this.dni = dni;
    }

    public long getPersonaId() {
        return personaId;
    }

    public void setPersonaId(long personaId) {
        this.personaId = personaId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
