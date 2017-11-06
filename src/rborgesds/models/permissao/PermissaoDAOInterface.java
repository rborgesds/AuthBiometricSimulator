package rborgesds.models.permissao;

public interface PermissaoDAOInterface {
    public Permissao getPorId(int id);
    public boolean adicionar(Permissao permissao);
    public boolean atualizar(Permissao permissao);
    public boolean excluir(Permissao permissao);
}
