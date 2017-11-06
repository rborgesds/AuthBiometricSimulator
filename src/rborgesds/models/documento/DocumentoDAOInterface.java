package rborgesds.models.documento;

public interface DocumentoDAOInterface {
    public Documento getPorId(int id);
    public boolean adicionar(Documento documento);
    public boolean atualizar(Documento documento);
    public boolean excluir(Documento documento);
}
