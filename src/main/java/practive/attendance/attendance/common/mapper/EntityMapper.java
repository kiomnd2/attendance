package practive.attendance.attendance.common.mapper;

public interface EntityMapper<D,E> {
    D toModel(E model);
    E toEntity(D dto);
}
