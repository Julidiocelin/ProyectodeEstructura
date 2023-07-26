package profesor;

import java.util.List;

public class PlanificadorSemestre {
    private List<materia> materias;
    private List<paralelo> paralelos;
    private List<horario> horarios;
    private List<clase> clases;

    public PlanificadorSemestre(){
        
    }
    
    public List<materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<materia> materias) {
        this.materias = materias;
    }

    public List<paralelo> getParalelos() {
        return paralelos;
    }

    public void setParalelos(List<paralelo> paralelos) {
        this.paralelos = paralelos;
    }

    public List<horario> getHorarios() {
        return horarios;
    }

    public void setHorarios(List<horario> horarios) {
        this.horarios = horarios;
    }

    public List<clase> getClases() {
        return clases;
    }

    public void setClases(List<clase> clases) {
        this.clases = clases;
    }
    
    
}
