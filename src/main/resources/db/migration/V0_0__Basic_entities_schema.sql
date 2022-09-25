create table if not exists address (
    id bigserial primary key,
    country varchar not null,
    city varchar not null,
    street varchar not null,
    house varchar not null,
    apartment varchar not null
);

create table if not exists hotel (
    id bigserial primary key,
    name varchar not null,
    address_id bigint not null references address(id),
    stars int,
    rooms_number int not null
);