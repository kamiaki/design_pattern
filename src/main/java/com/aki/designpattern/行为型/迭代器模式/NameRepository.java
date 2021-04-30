package com.aki.designpattern.行为型.迭代器模式;

public class NameRepository implements Container { //创建实现Container接口的实体类，该类内部实现了Iterator接口的内部类NameIterator
    public String names[] = {"Robert","John","Julie","Lora"};
    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {
        int index;
        @Override
        public boolean hasNext() {
            if (index < names.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return names[index++];
            }
            return null;
        }
    }
}
