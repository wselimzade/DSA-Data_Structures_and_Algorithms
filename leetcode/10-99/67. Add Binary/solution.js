/**
 * @param {string} a
 * @param {string} b
 * @return {string}
 */

var addBinary = function(a, b) 
{
    const sizeA = a.length
    const sizeB = b.length

    if (sizeB > sizeA)
        for (let i = 0; i < sizeB - sizeA; ++i)
            a = '0' + a
    else if (sizeA > sizeB)
        for (let i = 0; i < sizeA - sizeB; ++i)
            b = '0' + b

    let indexA = a.length - 1
    let indexB = b.length - 1
    let more = false

    let sum = ""

    while (indexA >= 0 && indexB >= 0)
    {
        let A = a[indexA--]
        let B = b[indexB--]

        if (A == '1' && B == '1')
        {
            if (more)
                sum += '1'
            else
            {
                sum += '0'
                more = true;
            }
        }
        else if (A == '0' && B == '0')
        {
            if (more)
            {
                sum += '1'
                more = false
            }
            else
                sum += '0'
        }
        else
        {
            if (more)
                sum += '0'
            else
                sum += '1'
        }
    }

    sum = sum.split('').reverse().join('')

    if (more)
        sum = '1' + sum
    
    return sum
};