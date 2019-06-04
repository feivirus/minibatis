package com.feivirus.minibatis.session;

/**
 * 
 * @author feivirus
 *
 */
public class RowBounds {
    public static final int NO_OFFSET = 0;
    
    public static final int NO_LIMIT = Integer.MAX_VALUE;
    
    public static final RowBounds DEFAULT = new RowBounds();
    
    private final int offset;
    
    private final int limit;
    
    public RowBounds() {
        this.offset = NO_OFFSET;        
        this.limit = NO_LIMIT;
    }
    
    public RowBounds(int offset, int limit) {
        this.offset = offset;
        this.limit = limit;
    }

    public int getOffset() {
        return offset;
    }

    public int getLimit() {
        return limit;
    }
}
