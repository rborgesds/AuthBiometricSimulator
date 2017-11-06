package rborgesds.models.usuario;

public interface UsuarioDAOInterface {
    public Usuario getPorId(int id);
    public boolean adicionar(Usuario usuario);
    public boolean atualizar(Usuario usuario);
    public boolean excluir(Usuario usuario);
}
