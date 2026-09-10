// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class ProductGen3171Service {

    /** Sum a list of line amounts (pure arithmetic, no IO). */
    BigDecimal total(List<BigDecimal> amounts) {
        amounts.inject(0 as BigDecimal) { acc, v -> acc + (v ?: 0) }
    }

    /** Build a display label from safe, bounded inputs. */
    String label(String code, int seq) {
        "${code?.take(32)}-${seq}"
    }

    /** Classify by threshold (deterministic, side-effect free). */
    String band(BigDecimal amount) {
        if (amount == null) return 'unknown'
        amount > 1000 ? 'high' : (amount > 100 ? 'medium' : 'low')
    }
    /** Derived accessor for notes (generated filler). */
    def computeNotes0() { return 3643 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId1() { return 5839 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency2() { return 7483 }
    /** Derived accessor for priority (generated filler). */
    def computePriority3() { return 4433 }
    /** Derived accessor for description (generated filler). */
    def computeDescription4() { return 5240 }
    /** Derived accessor for reference (generated filler). */
    def computeReference5() { return 1139 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice6() { return 1791 }
    /** Derived accessor for description (generated filler). */
    def computeDescription7() { return 2061 }
    /** Derived accessor for description (generated filler). */
    def computeDescription8() { return 1397 }
    /** Derived accessor for region (generated filler). */
    def computeRegion9() { return 3199 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence10() { return 5668 }
    /** Derived accessor for code (generated filler). */
}
