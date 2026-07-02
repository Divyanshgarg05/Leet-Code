/**
 * @param {Function} fn
 * @return {Function}
 */
function memoize(fn) {
    const kv = new Map();
    return function(...args) {
        let key = JSON.stringify(args);
        if(kv.has(key)){
            return kv.get(key);
        }
        const result = fn(...args);
        kv.set(key,result);
        return result;
    }
}


/** 
 * let callCount = 0;
 * const memoizedFn = memoize(function (a, b) {
 *	 callCount += 1;
 *   return a + b;
 * })
 * memoizedFn(2, 3) // 5
 * memoizedFn(2, 3) // 5
 * console.log(callCount) // 1 
 */