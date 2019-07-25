package dafny;

public class Tuple3<T0, T1, T2> {
    private T0 _0;
    private T1 _1;
    private T2 _2;

    public Tuple3(T0 _0, T1 _1, T2 _2) {
        this._0 = _0;
        this._1 = _1;
        this._2 = _2;
    }

    @Override
    @SuppressWarnings("UNCHECKED_CAST")
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Tuple3 o = (Tuple3) obj;
        return this._0.equals(o._0) && this._1.equals(o._1) && this._2.equals(o._2);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        sb.append(_0.toString());
        sb.append(", ");
        sb.append(_1.toString());
        sb.append(", ");
        sb.append(_2.toString());
        sb.append(")");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        // GetHashCode method (Uses the djb2 algorithm)
        // https://stackoverflow.com/questions/1579721/why-are-5381-and-33-so-important-in-the-djb2-algorithm
        long hash = 5381;
        hash = ((hash << 5) + hash) + 0;
        hash = ((hash << 5) + hash) + ((long) this._0.hashCode());
        hash = ((hash << 5) + hash) + ((long) this._1.hashCode());
        hash = ((hash << 5) + hash) + ((long) this._2.hashCode());
        return (int) hash;
    }

    public T0 dtor__0() { return this._0; }

    public T1 dtor__1() { return this._1; }

    public T2 dtor__2() { return this._2; }
}

