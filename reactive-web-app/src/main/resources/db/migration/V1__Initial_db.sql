CREATE TABLE IF NOT EXISTS book (
    id BIGSERIAL PRIMARY KEY,
    title TEXT NOT NULL,
    author TEXT NOT NULL
);

INSERT INTO book (title, author)
VALUES
    ('Midnight Library', 'Matt Hagg'),
    ('The world', 'Matt Wo'),
    ('The war', 'Matt Wa'),
    ('The peace', 'Matt Pea'),
    ('The Future', 'Matt Fut');
